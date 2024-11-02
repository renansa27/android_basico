package renan.puc.lifecycle_and_fragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val TAG = "ActivityLifecycle::"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            finish();
        }

        println("$TAG${javaClass.simpleName}::onCreate");

    }

    override fun onStart(){
        super.onStart()
        println("$TAG${javaClass.simpleName}::onStart");
    }

    override fun onResume(){
        super.onResume()
        println("$TAG${javaClass.simpleName}::onResume");
    }

    override fun onPause(){
        super.onPause()
        println("$TAG${javaClass.simpleName}::onPause");
    }

    override fun onStop(){
        super.onStop()
        println("$TAG${javaClass.simpleName}::onStop");
    }

    override fun onDestroy(){
        super.onDestroy()
        println("$TAG${javaClass.simpleName}::onDestroy");
    }

    override fun onRestart(){
        super.onRestart()
        println("$TAG${javaClass.simpleName}::onRestart");
    }
}