package mx.edu.ittepic.ladm_u4_practica_2_braylosky_ramirez_fletes_20_xx

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    var sensorAcelerometro_X = 200f
    var sensorAcelerometro_Y = 400F
    var sensorAproximidad = true
    var sol = Constructor(650f,30,150)
    var s1 = Constructor(220f,100,10)
    var s2 = Constructor(450f,200,10)
    var s3 = Constructor(650f,600,10)
    var s4 = Constructor(570f,700,10)
    var s5 = Constructor(120f,300,10)
    var s6 = Constructor(700f,900,10)
    var luna = Constructor(650f,30,150)
    var luna2 = Constructor(725f,30,150)

    override fun onDraw(canvas : Canvas) {
        var p = Paint()

        if(sensorAproximidad) {
            canvas.drawColor(Color.BLACK)
            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            luna.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.BLACK
            p.strokeWidth = 10f
            luna.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.BLACK
            luna2.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.BLACK
            luna2.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s1.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s1.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s1.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s1.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s2.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE

            s2.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s3.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s3.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s4.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s4.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s5.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s5.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            s6.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            s6.pintar(canvas,p)




        } else if(sensorAproximidad == false) {
            canvas.drawRGB(151, 199, 228)
            p.color = Color.YELLOW
            sol.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            p.strokeWidth = 10f
            sol.pintar(canvas,p)
        }
        p.color = Color.RED
        p.style = Paint.Style.FILL
        canvas.drawCircle(sensorAcelerometro_X,700f,200f,p)
        canvas.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.piza), sensorAcelerometro_X+300f,700f, p)
    }
}