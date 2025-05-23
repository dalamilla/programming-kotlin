package com.dalamilla.tipcalculator

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var billAmountEditText: EditText
    private lateinit var tipPercentageEditText: EditText
    private lateinit var tipAmountTextView: TextView
    private lateinit var roundUpTipSwitch: SwitchCompat
    private var roundUP: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        billAmountEditText = findViewById(R.id.billAmountEditText)
        tipPercentageEditText = findViewById(R.id.tipPercentageEditText)
        tipAmountTextView = findViewById(R.id.tipAmountTextView)
        roundUpTipSwitch = findViewById(R.id.roundUpTipSwitch)

        val textWatcher =
            object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int,
                ) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

                override fun afterTextChanged(s: Editable?) {
                    calculateTip()
                }
            }

        billAmountEditText.addTextChangedListener(textWatcher)
        tipPercentageEditText.addTextChangedListener(textWatcher)

        roundUpTipSwitch.setOnCheckedChangeListener { _, isChecked ->
            roundUP = isChecked
            calculateTip()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        calculateTip()
    }

    private fun calculateTip() {
        val currencyFormat = NumberFormat.getCurrencyInstance()

        val billAmountString = billAmountEditText.text.toString()
        val billAmount = billAmountString.toDoubleOrNull() ?: 0.0

        val tipPercentageString = tipPercentageEditText.text.toString()
        val tipPercentage = tipPercentageString.toDoubleOrNull() ?: 15.0

        var tipAmount = if (roundUP) {
            kotlin.math.ceil(billAmount * (tipPercentage / 100))
        } else {
            billAmount * (tipPercentage / 100)
        }

        tipAmountTextView.text = getString(R.string.tip_amount, currencyFormat.format(tipAmount))
    }
}
