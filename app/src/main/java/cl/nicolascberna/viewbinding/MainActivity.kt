package cl.nicolascberna.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cl.nicolascberna.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pressButton.setOnClickListener { onPressButton() }
    }

    private fun onPressButton() {
        Toast.makeText(applicationContext, "Button Pressed", Toast.LENGTH_SHORT).show()
        binding.showMessage.text = "I'm using view binding!"
    }
}