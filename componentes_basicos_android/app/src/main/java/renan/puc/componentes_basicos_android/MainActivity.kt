package renan.puc.componentes_basicos_android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

        // Referências aos elementos da interface do usuário
        val searchTextField = findViewById<EditText>(R.id.searchTextField);
        val searchButton = findViewById<Button>(R.id.searchButton);
        val progressBar = findViewById<ProgressBar>(R.id.progressBar);
        val resultImage = findViewById<ImageView>(R.id.resultImage);
        val resultTitle = findViewById<TextView>(R.id.resultTitle);
        val resultDescription = findViewById<TextView>(R.id.resultDescription);
        val scrollView = findViewById<ScrollView>(R.id.scrollView);

        searchButton.setOnClickListener {
            val searchValue = searchTextField.text.toString()
            Toast.makeText(
                this,
                "Valor do campo de texto ${searchTextField.text}",
                Toast.LENGTH_SHORT
            ).show()

            progressBar.visibility = ProgressBar.VISIBLE
            searchButton.visibility = Button.GONE
            searchTextField.isEnabled = false

            if (searchValue == "lagarto") {
                lifecycleScope.launch {
                    val result = consultApi()
                    resultTitle.text = result.title
                    resultDescription.text = result.description
                    resultImage.setImageDrawable(result.image)
                    //resultImage.setImageResource(result.image)

                    scrollView.visibility = ScrollView.VISIBLE
                    progressBar.visibility = ProgressBar.GONE
                    searchButton.visibility = Button.VISIBLE
                    searchTextField.isEnabled = true
                }
            }

        }
    }

    // Função assincrona
    private suspend fun consultApi(): InsetoModel {
        delay(1500)
        return InsetoModel(
            title = "Lagarto",
            description = "A maioria dos lagartos é ativa durante o dia e repousa à noite. As lagartixas, porém, geralmente são ativas do anoitecer até o raiar do dia. Os diferentes tipos de lagarto se locomovem de maneiras diversas. A maioria corre sobre quatro pernas, mas alguns correm mais velozmente sobre as patas traseiras, apenas levantando a parte da frente do corpo. Os lagartos sem pernas se locomovem do mesmo modo que as serpentes.\n" +
                    "\n" +
                    "Muitos lagartos conseguem mudar sua coloração escura e discreta por uma cor mais viva e forte. Fazem isso quando tentam atrair um lagarto do sexo oposto ou assustar outro animal. Para alguns lagartos, a mudança de cor é um meio de comunicar-se com outros lagartos, faz parte de sua linguagem. A temperatura e a luz também afetam as mudanças de cor.\n" +
                    "\n" +
                    "Os lagartos passam boa parte do tempo procurando alimento. A maioria deles se alimenta de insetos, mas alguns comem sementes e plantas. Os lagartos podem escavar a terra em busca de alimento, mas também podem aguardar sua presa se aproximar e então avançar de repente para agarrá-la.\n" +
                    "\n" +
                    "A maioria dos lagartos foge de seus inimigos. Mas às vezes é impossível evitar um deles. Quando isso acontece, ele se infla de ar e fica ereto. Isso faz o lagarto parecer maior e mais assustador.\n" +
                    "\n" +
                    "Muitos lagartos usam a cauda para escapar de seus inimigos. Ela se desprende do corpo quando é tocada e então fica se retorcendo no chão. A cauda em movimento distrai a atenção do inimigo e, enquanto isso, o lagarto escapa. Geralmente uma cauda nova se desenvolve no lugar da que caiu.",
            image = ContextCompat.getDrawable(this, R.mipmap.lagarto)
        )
    }
}

