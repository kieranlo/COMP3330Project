package hk.hkucs.comp3330project

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    // for coach_reg_1.xml

    var submitButton: Button? = null
    var simpleSeekBar: SeekBar? = null
    var progressLabel: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coach_reg_1)

        // initiate  views
        simpleSeekBar=findViewById<SeekBar>(R.id.AgeInput);
        progressLabel =findViewById<TextView>(R.id.AgeTextView);

        // perform seek bar change listener event used for getting the progress value
        // perform seek bar change listener event used for getting the progress value
        simpleSeekBar!!.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            var progressChangedValue = 0


            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                progressChangedValue = progress
//                progressLabel.setText(prgressChangeValue);
//                progressLabel.text.toString("Progress: $progress")
//                progressLabel?.text = getString(Integer.parseInt(progressChangedValue))
//                progressLabel?.text = getString(progressChangedValue)
//                progressLabel?.text = getString(R.string.name)

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(
                    this@MainActivity, "Seek bar progress is :$progressChangedValue",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.coach_reg_3)
//    }


}