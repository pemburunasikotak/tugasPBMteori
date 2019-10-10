package tj.belajar.tugasspiner
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    var menu = arrayOf("Nasi Goreng", "Nasi Ayam","Nasi Pecel")

    var spinner:Spinner? = null
    var textView_msg:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_msg = this.msg

        spinner = this.spinner_sample
        spinner!!.setOnItemSelectedListener(this)

        // Create an ArrayAdapter using a simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, menu)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner!!.setAdapter(aa)

    }
    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg!!.text = "Selected : "+menu[position]
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}