package com.example.sculator

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*
import android.content.Intent


class MainActivity : AppCompatActivity() {

    // creating variables for our text view and button
    private lateinit var tvsec: TextView
    private lateinit var tvMain: TextView
    private lateinit var bac: Button
    private lateinit var bc: Button
    private lateinit var bbrac1: Button
    private lateinit var bbrac2: Button
    private lateinit var bsin: Button
    private lateinit var bcos: Button
    private lateinit var btan: Button
    private lateinit var blog: Button
    private lateinit var bln: Button
    private lateinit var bfact: Button
    private lateinit var bsquare: Button
    private lateinit var bsqrt: Button
    private lateinit var binv: Button
    private lateinit var b0: Button
    private lateinit var b9: Button
    private lateinit var b8: Button
    private lateinit var b7: Button
    private lateinit var b6: Button
    private lateinit var b5: Button
    private lateinit var b4: Button
    private lateinit var b3: Button
    private lateinit var b2: Button
    private lateinit var b1: Button
    private lateinit var bpi: Button
    private lateinit var bmul: Button
    private lateinit var bminus: Button
    private lateinit var bplus: Button
    private lateinit var bequal: ImageButton
    private lateinit var bdot: Button
    private lateinit var bdiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

        var isSign = false
        var isEqual = false

        // initializing all our variables.
        tvsec = findViewById(R.id.idTVSecondary)
        tvMain = findViewById(R.id.idTVprimary)
        bac = findViewById(R.id.bac)
        bc = findViewById(R.id.bc)
        bbrac1 = findViewById(R.id.bbrac1)
        bbrac2 = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        binv = findViewById(R.id.binv)
        b0 = findViewById(R.id.b0)
        b9 = findViewById(R.id.b9)
        b8 = findViewById(R.id.b8)
        b7 = findViewById(R.id.b7)
        b6 = findViewById(R.id.b6)
        b5 = findViewById(R.id.b5)
        b4 = findViewById(R.id.b4)
        b3 = findViewById(R.id.b3)
        b2 = findViewById(R.id.b2)
        b1 = findViewById(R.id.b1)
        bpi = findViewById(R.id.bpi)
        bmul = findViewById(R.id.bmul)
        bminus = findViewById(R.id.bminus)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bdiv = findViewById(R.id.bdiv)

        val iButton = findViewById<ImageButton>(R.id.ibutton)

        iButton.setOnClickListener {
            val intent = Intent(this, CraditsActivity::class.java)
            startActivity(intent)
        }

        // adding on click listener to our all buttons.
        b1.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "1")
        }
        b2.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "2")
        }
        b3.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            // on below line we are appending
            // the expression to our text view.
            tvMain.text = (tvMain.text.toString() + "3")
        }
        b4.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "4")
        }
        b5.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "5")
        }
        b6.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "6")
        }
        b7.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "7")
        }
        b8.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "8")
        }
        isSign = false
        b9.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            tvMain.text = (tvMain.text.toString() + "9")
        }
        b0.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = ""

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + "0")
        }
        bdot.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "0"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = "0"
            }
            isSign = false
            tvMain.text = (tvMain.text.toString() + ".")
        }
        bplus.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = true
            tvMain.text = (tvMain.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"

            }
            isEqual = false
            if (tvMain.text == "") {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                isSign = true
                tvMain.text = (tvMain.text.toString() + "/")
            }
        }
        bminus.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"
                isSign = true

            }
            isEqual = false
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                if (tvMain.text == "00") {
                    tvMain.text = ""
                    isSign = true
                }
                tvMain.text = (tvMain.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "") {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // if mul sign is not present in our
                // text view then only we are adding
                // the multiplication operator to it.
                val str: String = tvMain.text.toString()
                if (!str.get(index = str.length - 1).equals("*")) {
                    isSign = true
                    tvMain.text = (tvMain.text.toString() + "*")
                }
            }
        }
        bbrac1.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = true
            tvMain.text = (tvMain.text.toString() + "(")
        }
        bbrac2.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            isSign = true
            tvMain.text = (tvMain.text.toString() + ")")
        }
        bpi.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            tvMain.text = (tvMain.text.toString() + "3.142")
            tvsec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            tvMain.text = (tvMain.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            tvMain.text = (tvMain.text.toString() + "cos")
        }
        btan.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            tvMain.text = (tvMain.text.toString() + "tan")
        }
        binv.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (tvMain.text == "") {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                tvMain.text = (tvMain.text.toString() + "^" + "(-1)")
            }
        }
        bln.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            tvMain.text = (tvMain.text.toString() + "ln")
        }
        blog.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")+"
                isSign = true

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (!isSign && tvMain.text != "") {
                tvMain.text = (tvMain.text.toString() + "*")
            }
            tvMain.text = (tvMain.text.toString() + "log")
        }
        bsqrt.setOnClickListener {
            if (isEqual) {
                tvsec.text = ""
                tvMain.text = "(" + tvMain.text + ")"

            }
            isEqual = false
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvMain.text.toString()
                // on below line we are calculation
                // square root of the given number.
                val r = sqrt(str.toDouble())
                // on below line we are converting our double
                // to string and then setting it to text view.
                var result = r.toString()
                if (result.length > 10) {
                    result = result.substring(0, 9)
                }
                tvMain.text = result
            }
        }
        bequal.setOnClickListener {
            if (tvMain.text == "") {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvMain.text.toString()
                // on below line we are calling an evaluate
                // method to calculate the value of expressions.
                val result: Double = evaluate(str)
                // on below line we are getting result
                // and setting it to text view.
                var r = result.toString()

                if (r.length > 10) {
                    r = r.substring(0, 9)
                }
                tvMain.text = r
                tvsec.text = str

            }
            isEqual = true
        }
        bac.setOnClickListener {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            tvMain.text = "00"
            tvsec.text = ""
            isEqual = false
        }
        bc.setOnClickListener {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            var str: String = tvMain.text.toString()
            if (str != "") {
                when {
                    str.length >= 3 -> {
                        str = if (str[str.length - 1] == 's'
                            || str[str.length - 1] == 'g'
                        ) {
                            str.substring(0, str.length - 3)
                        } else if (str[str.length - 1] == 'n') {
                            if (str[str.length - 2] == 'l') {
                                str.substring(0, str.length - 2)
                            } else {
                                str.substring(0, str.length - 3)
                            }
                            str.substring(0, str.length - 3)
                        } else {
                            str.substring(0, str.length - 1)
                        }
                    }
                    str.length == 2 -> {
                        str = if (str[str.length - 1] == 'n') {
                            str.substring(0, str.length - 2)
                        } else {
                            str.substring(0, str.length - 1)
                        }
                    }
                    else -> {
                        str = str.substring(0, str.length - 1)
                    }
                }
                tvMain.text = str
            }
        }
        bsquare.setOnClickListener {
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting the expression and then calculating the square of the number
                val d: Double = tvMain.text.toString().toDouble()
                // on below line we are calculating the square.
                val square = d * d
                // after calculating the square we
                // are setting it to text view.
                tvMain.text = square.toString()
                // on below line we are setting
                // the d to secondary text view.
                tvsec.text = "$d²"
            }
        }
        bfact.setOnClickListener {
            if (tvMain.text == "00") {
                tvMain.text = ""
            }
            if (tvMain.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting int value
                // and calculating the factorial value of the entered number.
                val value: Int = tvMain.text.toString().toInt()
                val fact: Int = factorial(value)
                tvMain.text = fact.toString()
                tvsec.text = "$value`!"
            }

        }

    }

    private fun factorial(n: Int): Int {
        // this method is use to find factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    private fun evaluate(str: String): Double {
        return object : Any() {
            // on below line we ar creating variable
            // for tracking the position and char pos.
            var pos = -1
            var ch = 0

            // below method is for moving to next character.
            fun nextChar() {
                // on below line we are incrementing our position
                // and moving it to next position.
                ch = if (++pos < str.length) str[pos].code else -1
            }

            // this method is use to check the extra space
            // present int the expression and removing it.
            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.code) nextChar()
                // on below line we are checking the char pos
                // if both is equal then we are returning it to true.
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            // below method is to parse our
            // expression and to get the ans
            // in this we are calling a parse
            // expression method to calculate the value.
            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            // in this method we will only perform addition and
            // subtraction operation on the expression.
            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    when {
                        eat('+'.code) -> x += parseTerm() // addition
                        eat('-'.code) -> x -= parseTerm() // subtraction
                        else -> return x
                    }
                }
            }

            // in below method we will perform
            // only multiplication and division operation.
            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    when {
                        eat('*'.code) -> x *= parseFactor() // multiplication
                        eat('/'.code) -> x /= parseFactor() // division
                        else -> return x
                    }
                }
            }

            // below method is use to parse the factor
            fun parseFactor(): Double {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+'.code)) return parseFactor() // unary plus
                if (eat('-'.code)) return -parseFactor() // unary minus
                // creating a double variable for ans.
                var x: Double
                // on below line we are creating
                // a variable for position.
                val startPos = pos
                // on below line we are checking
                // for opening and closing parenthesis.
                if (eat('('.code)) { // parentheses
                    x = parseExpression()
                    eat(')'.code)
                } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.toInt()) {
                    // numbers
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.toInt()) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.code && ch <= 'z'.code) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.code && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    // calling a method to parse our factor.
                    x = parseFactor()
                    // on below line we are checking for square root.
                    x =
                        when (func) {
                            "sqrt" -> sqrt(x)
                            // on below line we are checking for sin function
                            // and calculating sin function using Math class.
                            "sin" -> sin(
                                Math.toRadians(x)
                                // on below line we are calculating the cos value
                            )
                            "cos" -> cos(
                                Math.toRadians(x)
                                // on below line we are calculating
                                // the tan value of our expression.
                            )
                            "tan" -> tan(Math.toRadians(x))
                            // on below line we are calculating
                            // log value of the expression.
                            "log" -> log10(x)
                            // on below line we are calculating
                            // ln value of expression.
                            "ln" -> ln(x)
                            // f we get any error then
                            // we simply return the exception.
                            else -> throw RuntimeException(
                                "Unknown function: $func"
                            )
                        }
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // on below line we are calculating the power of the expression.
                if (eat('^'.code)) x = x.pow(parseFactor()) // exponentiation
                return x
            }
            // at last calling a parse for our expression.
        }.parse()
    }
}
