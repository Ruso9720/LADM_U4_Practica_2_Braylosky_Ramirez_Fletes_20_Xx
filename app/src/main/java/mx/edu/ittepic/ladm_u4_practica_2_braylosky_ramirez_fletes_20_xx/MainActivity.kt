package mx.edu.ittepic.ladm_u4_practica_2_braylosky_ramirez_fletes_20_xx

import android.content.Context
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var lienzo : Lienzo
    var figura  : Constructor ?= null
    private var color = false
    lateinit var sensor : SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lienzo = Lienzo(this)
        setContentView(lienzo)

        sensor = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor.registerListener(this, sensor.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL)
        sensor.registerListener(this, sensor.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)

    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }
    override fun onSensorChanged(event: SensorEvent) {
        var mover = event.values[0]
        if(event.sensor.type == Sensor.TYPE_PROXIMITY) {
            lienzo.sensorAproximidad = (event.values[0] >= 5f)
        }
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            //SOLO FUNCIONA UNO ACTIVO SI LOS 2 ESTAN SE VA ESQUINADO
            lienzo.sensorAcelerometro_X = (lienzo.sensorAcelerometro_X + (-mover))
            lienzo.sensorAcelerometro_Y = (lienzo.sensorAcelerometro_Y + (-mover))
        }

        lienzo.invalidate()
    }
}
