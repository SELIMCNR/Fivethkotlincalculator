package com.selimcinar.fivethkotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla (view : View){
        var sayi1 = textEdit.text.toString().toDoubleOrNull()  // texediten değeri al double veya nulla dönüştür sayi1 e ekle
        var sayi2 = textEdit2.text.toString().toDoubleOrNull()  // texedit 2'den değeri al double veya nulla dönüştür sayi2 e ekle

        if(sayi1 == null || sayi2 == null) {                   //Nullsa bu değeri yaz
            textView.text = "Sayı girmeyi unutmayınız !"
        }
        else {                                          //Null değilse işlemi yap
            var sonuc = sayi1 + sayi2
            textView.text = "Sonuç : ${sonuc}"              //Textviewe sonucu yazdır
        }

    }

    fun cikar (view: View) {
        var sayi1 = textEdit.text.toString().toDoubleOrNull()
        var sayi2 = textEdit2.text.toString().toDoubleOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayı girmeyi unutmayınız !"
        }
        else {
            var sonuc = sayi1 - sayi2
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun bol (view: View){
        var sayi1 = textEdit.text.toString().toDoubleOrNull()
        var sayi2 = textEdit2.text.toString().toDoubleOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayı girmeyi unutmayınız !"
        }
        else {
            var sonuc = sayi1 / sayi2
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun carp(view: View){
        var sayi1 = textEdit.text.toString().toDoubleOrNull()
        var sayi2 = textEdit2.text.toString().toDoubleOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayı girmeyi unutmayınız !"
        }
        else {
            var sonuc = sayi1 * sayi2
            textView.text = "Sonuç : ${sonuc}"
        }
    }

}