package mx.edu.ittepic.ladm_u4_practica_2_braylosky_ramirez_fletes_20_xx

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint

class Constructor (){

    var x = 0f
    var y = 0f
    var tipo = 1
    var ancho = 0f
    var alto = 0f
    var img : Bitmap?= null
    var radio = 0f
    constructor(x:Float, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho  y alto para tratar circulo como cuadrado
        ancho = this.radio*2
        tipo = 1
        alto = ancho
    }
    constructor(bitmap: Bitmap, x:Float, y:Float) : this(){
        img = bitmap
        this.x = x.toFloat()
        this.y = y.toFloat()
        tipo = 2
        ancho = img!!.width.toFloat()
        alto = img!!.height.toFloat()
    }



    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
            2->{
                c.drawBitmap(img!!,x,y,p)
            }
        }
    }}