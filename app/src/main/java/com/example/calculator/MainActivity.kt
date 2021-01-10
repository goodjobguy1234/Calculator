package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val df = DecimalFormat("#,##0.######")
        val dn = DecimalFormat("0.######E0")
        var reset = false
        var isCanDot = true
        var isspecial = false
        //Number
        btn_zero.setOnClickListener {
            if (tv_answer.text.isEmpty() && tv_answer.text.length <= 40){
                reset = true
                tv_answer.append(0.toString())
            }
            else if (!reset && tv_answer.text.length <= 40){
                tv_answer.append(0.toString())

            }
            else{
                tv_answer.text = "0"
                isCanDot = true
                isspecial = false
            }
        }
        btn_one.setOnClickListener {
            if (reset) {
                tv_answer.text = "1"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(1.toString())
            }
        }
        btn_two.setOnClickListener {
            if (reset) {
                tv_answer.text = "2"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(2.toString())
            }
        }
        btn_three.setOnClickListener {
            if (reset) {
                tv_answer.text = "3"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(3.toString())
            }
        }
        btn_four.setOnClickListener {
            if (reset) {
                tv_answer.text = "4"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(4.toString())
            }
        }
        btn_five.setOnClickListener {
            if (reset) {
                tv_answer.text = "5"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(5.toString())
            }
        }
        btn_six.setOnClickListener {
            if (reset) {
                tv_answer.text = "6"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(6.toString())
            }
        }
        btn_seven.setOnClickListener {
            if (reset) {
                tv_answer.text = "7"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(7.toString())
            }
        }
        btn_eight.setOnClickListener {
            if (reset) {
                tv_answer.text = "8"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(8.toString())
            }
        }
        btn_nine.setOnClickListener {
            if (reset) {
                tv_answer.text = "9"
                reset = false
                isCanDot = true
                isspecial = false
            }
            else if (tv_answer.text.length <= 40){
                tv_answer.append(9.toString())
            }
        }

        //Operation

        btn_plus.setOnClickListener {
            if (tv_answer.text.isNotEmpty() && tv_answer.text.length <= 40 && !isspecial) {
                if(!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                    && !tv_answer.text[tv_answer.text.length-1].equals('*') && !tv_answer.text[tv_answer.text.length-1].equals('/')
                    && !tv_answer.text[tv_answer.text.length-1].equals('.')) {
                    tv_answer.append("+")
                    reset = false
                    isCanDot = true
                }
            }
            else if (isspecial){
                tv_answer.text = ""
                isCanDot = true
            }

        }
        btn_div.setOnClickListener {
            if (tv_answer.text.isNotEmpty() && tv_answer.text.length <= 40 && !isspecial) {
                if (!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                    && !tv_answer.text[tv_answer.text.length-1].equals('*') && !tv_answer.text[tv_answer.text.length-1].equals('/')
                    && !tv_answer.text[tv_answer.text.length-1].equals('.')) {
                    tv_answer.append("/")
                    reset = false
                    isCanDot = true
                }
            }
            else if (isspecial){
                tv_answer.text = ""
                isCanDot = true
            }

        }
        btn_mul.setOnClickListener {
            if (tv_answer.text.isNotEmpty() &&tv_answer.text.length <= 40 && !isspecial) {
                if (!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                    && !tv_answer.text[tv_answer.text.length-1].equals('*') && !tv_answer.text[tv_answer.text.length-1].equals('/')
                    && !tv_answer.text[tv_answer.text.length-1].equals('.')) {
                    tv_answer.append("*")
                    reset = false
                    isCanDot = true
                }
            }
            else if (isspecial){
                tv_answer.text = ""
                isCanDot = true
            }

        }

        btn_mod.setOnClickListener {
            if (tv_answer.text.isNotEmpty() && tv_answer.text.length <= 40 && !isspecial) {
                if (!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                    && !tv_answer.text[tv_answer.text.length-1].equals('*') && !tv_answer.text[tv_answer.text.length-1].equals('/')
                    && !tv_answer.text[tv_answer.text.length-1].equals('%')
                    && !tv_answer.text[tv_answer.text.length-1].equals('.')) {
                    tv_answer.append("%")
                    reset = false
                    isCanDot = true
                }
            }
            else if (isspecial){
                tv_answer.text = ""
                isCanDot = true
            }
        }
        btn_minus.setOnClickListener {
            if (tv_answer.text.isEmpty() && tv_answer.text.length <= 40 && !isspecial) {
                tv_answer.append("-")
                reset = false
                isCanDot = true
            }
            else if (!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                && !tv_answer.text[tv_answer.text.length-1].equals('.')){
                tv_answer.append("-")
                reset = false
                isCanDot = true
            }
            else if (isspecial){
                tv_answer.text = "-"
                isCanDot = true
            }
        }
        //Optional

        btn_dot.setOnClickListener {
            if (isCanDot  && tv_answer.text.length <= 40 && tv_answer.text.length>0 && !isspecial ){
                if(!tv_answer.text[tv_answer.text.length-1].equals('-') && !tv_answer.text[tv_answer.text.length-1].equals('+')
                    && !tv_answer.text[tv_answer.text.length-1].equals('*') && !tv_answer.text[tv_answer.text.length-1].equals('/')
                    && !tv_answer.text[tv_answer.text.length-1].equals('%')) {
                    tv_answer.append(".")
                    isCanDot = false
                    reset = false
                }
            }

        }
        btn_delete.setOnClickListener {
            if(tv_answer.text.length>0){
                var deleteText = tv_answer.text[tv_answer.text.length - 1]
                if(deleteText.equals('.')) {
                    isCanDot = true
                }
                    tv_answer.text = tv_answer.text.subSequence(0, (tv_answer.text.length) - 1)
                    tv_answer.textSize += 1.0f

            }
            if(isspecial){
                tv_answer.text = ""
            }
        }
        btn_reset.setOnClickListener {
            tv_answer.text = ""
            tv_equation.text=""
            tv_answer.setTextSize(50.0f)
            reset = true
            isCanDot = true
            isspecial = false

        }
////////////btn +/-
        btn_reflex.setOnClickListener{
            if (tv_answer.text.isNotEmpty()){
                var txt = tv_answer.text.toString()
                var lastindex = 0
                var first:String
                var last:String
                if (txt.contains("+") or txt.contains("-")
                    or txt.contains("*") or txt.contains("/")) {

                    for (i in 0 until txt.length) {
                        if (txt[i].equals('+') or txt[i].equals('-') or txt[i].equals('*') or txt[i].equals('/')) {
                            lastindex = i
                        }
                    }
                    first = txt.subSequence(0,lastindex).toString()
                    last = txt.subSequence(lastindex+1,txt.length).toString()
                    if (txt[lastindex].equals('+')) {
                        tv_answer.text = first + "-" + last
                    }
                    else if(txt.get(lastindex).equals('-')){
                        if (lastindex ==0){
                            tv_answer.text = txt.subSequence(1,txt.length).toString()
                        }
                        else if (!(txt[lastindex-1].equals('*') or txt[lastindex-1].equals('/'))) {
                            tv_answer.text = first + "+" + last
                        }
                        else{
                            tv_answer.text = txt.subSequence(0,lastindex).toString() + txt.subSequence(lastindex+1,txt.length).toString()
                        }
                    }
                    else if (txt.get(lastindex).equals('*') or txt.get(lastindex).equals('/') or txt.get(lastindex).equals('%')){
                        tv_answer.text = txt.subSequence(0,lastindex+1).toString() + "-" + txt.subSequence(lastindex+1,txt.length).toString()
                    }
                }else{
                    tv_answer.text = "-"+txt
                }
            }
            reset = false
        }

//////// on click equal btn
        btn_equal.setOnClickListener {
            if (tv_answer.text.isNotEmpty() && !isspecial )  {
                var txt = tv_answer.text.toString()
                var numlist = arrayListOf<Double>()//[2,4,35,2]
                var Operatorlist = arrayListOf<String>()
                var digit = false
                var mod = false
                var str = ""

                try {
                    for (i in 0 until txt.length) {
                        if (txt[i].isDigit() || txt[i].equals('E')) {
                            str += txt[i].toString()
                            digit = true
                            mod = false
                        } else if (txt[i].equals('.')) {
                            str += txt[i].toString()
                            digit = false
                            mod = false
                        } else {
                            if (txt[i].equals('-')) {
                                if (digit == true) {
                                    numlist.add(str.toDouble())
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                } else if (digit == false && mod == false) {
                                    str += "-"
                                    digit = false
                                    mod = false
                                } else if (mod == true) {
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                }

                            } else if (txt[i].equals('*') || txt[i].equals('/')) {
                                if (digit == true) {
                                    numlist.add(str.toDouble())
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                } else {
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                }
                            } else if (txt[i].equals('%')) {
                                if (digit == true) {
                                    numlist.add(str.toDouble())
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = true
                                }
                            } else if (txt[i].equals('+')) {
                                if (digit == false) {
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                } else {
                                    numlist.add(str.toDouble())
                                    Operatorlist.add("${txt[i]}")
                                    str = ""
                                    digit = false
                                    mod = false
                                }
                            }

                        }
                    }
                    if (!str.equals("") && !str.equals("-")) {
                        numlist.add(str.toDouble())
                    }
                    if (numlist.size > Operatorlist.size || Operatorlist[Operatorlist.size - 1].equals(
                            "%"
                        )
                    ) {
                        Equation(numlist, Operatorlist)
                    }/// call func  equal
                    else {
                        Operatorlist.removeAt(Operatorlist.size - 1)
                        numlist.add(1.0)
                        Equation(numlist, Operatorlist)
                    }
                    tv_equation.text = txt//show solution
                    var result = numlist[0]
                    ////////convert to check if it no decimal only print Int
                    if (result >= 10000000000){
                        tv_answer.text = dn.format(result)
                    }
                    else {
                        tv_answer.text = df.format(result)
                    }


                    if(tv_answer.text.contains(".")){
                        isCanDot = false
                    }
                    else{
                        isCanDot = true
                    }
                    if(result.isInfinite() || result.isNaN()){
                        isspecial = true
                    }
                    else{
                        isspecial = false
                    }
                }
                catch (t: Throwable) {
                    val handler = Handler()
                    tv_answer.text = "ERROR"
                    handler.postDelayed(800) {
                        tv_answer.text = ""
                        tv_equation.text = ""
                    }
                    isCanDot = true
                }

                numlist.clear()
                Operatorlist.clear()
                reset = true
            }
        }
    }
///////////// equation function
    private fun Equation(
        numlist: ArrayList<Double>,
        operatorlist: ArrayList<String>
    ) {
        numlist.add(1.0)
        operatorlist.add("*")
        var indexmod: Int
        var ans = 0.0
        var indexmul: Int
        var indexdiv: Int
        var indexplus: Int
        var indexminus: Int
        while (operatorlist.contains("%")) {
            indexmod = operatorlist.indexOf("%")
            if (indexmod != operatorlist.size - 1 && ((operatorlist[indexmod + 1].equals(
                    "+") || operatorlist[indexmod + 1].equals("-") ||
                        operatorlist[indexmod + 1].equals("*") || operatorlist[indexmod + 1].equals("/")))
            ) {
                ans += (numlist[indexmod]) / 100
                operatorlist.remove("%")
                numlist.remove(numlist[indexmod])
                numlist.add(indexmod, ans)
                ans = 0.0
            }
            else {
                ans += (numlist[indexmod]) / 100
                if (numlist.size > 1) {
                    operatorlist.add(indexmod, "*")
                }
                operatorlist.remove("%")
                numlist.remove(numlist[indexmod])
                numlist.add(indexmod, ans)
                ans = 0.0
            }
        }
        while (operatorlist.contains("*") || operatorlist.contains("/")) {
            if (operatorlist.contains("*") && operatorlist.contains("/")) {
                indexmul = operatorlist.indexOf("*")
                indexdiv = operatorlist.indexOf("/")
                if (indexmul < indexdiv) {
                    ans += numlist[indexmul] * numlist[indexmul + 1]
                    operatorlist.remove("*")
                    numlist.remove(numlist[indexmul])
                    numlist.remove(numlist[indexmul])
                    numlist.add(indexmul, ans)
                    ans = 0.0
                } else {
                    ans += numlist[indexdiv] / numlist[indexdiv + 1]
                    operatorlist.remove("/")
                    numlist.remove(numlist[indexdiv])
                    numlist.remove(numlist[indexdiv])
                    numlist.add(indexdiv, ans)
                    ans = 0.0
                }
            } else if (operatorlist.contains("*")) {
                indexmul = operatorlist.indexOf("*")
                ans += numlist[indexmul] * numlist[indexmul + 1]
                operatorlist.remove("*")
                numlist.remove(numlist[indexmul])
                numlist.remove(numlist[indexmul])
                numlist.add(indexmul, ans)
                ans = 0.0
            } else {
                indexdiv = operatorlist.indexOf("/")
                ans += numlist[indexdiv] / numlist[indexdiv + 1]
                operatorlist.remove("/")
                numlist.remove(numlist[indexdiv])
                numlist.remove(numlist[indexdiv])
                numlist.add(indexdiv, ans)
                ans = 0.0
            }
        }
        while (operatorlist.contains("+") || operatorlist.contains("-")) {
            if (operatorlist.contains("+") && operatorlist.contains("-")) {
                indexplus = operatorlist.indexOf("+")
                indexminus = operatorlist.indexOf("-")
                if (indexplus < indexminus) {
                    ans += numlist[indexplus] + numlist[indexplus + 1]
                    operatorlist.remove("+")
                    numlist.remove(numlist[indexplus])
                    numlist.remove(numlist[indexplus])
                    numlist.add(indexplus, ans)
                    ans = 0.0
                } else {
                    ans += numlist[indexminus] - numlist[indexminus + 1]
                    operatorlist.remove("-")
                    numlist.remove(numlist[indexminus])
                    numlist.remove(numlist[indexminus])
                    numlist.add(indexminus, ans)
                    ans = 0.0
                }
            } else if (operatorlist.contains("+")) {
                indexplus = operatorlist.indexOf("+")
                ans += numlist[indexplus] + numlist[indexplus + 1]
                operatorlist.remove("+")
                numlist.remove(numlist[indexplus])
                numlist.remove(numlist[indexplus])
                numlist.add(indexplus, ans)
                ans = 0.0
            } else {
                indexminus = operatorlist.indexOf("-")
                ans += numlist[indexminus] - numlist[indexminus + 1]
                operatorlist.remove("-")
                numlist.remove(numlist[indexminus])
                numlist.remove(numlist[indexminus])
                numlist.add(indexminus, ans)
                ans = 0.0
            }
        }

    }

}
