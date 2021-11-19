package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.adapter.TarefaAdapter
import com.example.cardview.model.Tarefas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tarefas = mutableListOf<Tarefas>(
            Tarefas("Lavar a louça",
                "Limpar a pia toda",
                "Henrique",
                "18/11/2021",
                "Em andamento"
            ),
            Tarefas("Terminar Lição de História",
                "Finalizar o trabalho sobre o Império Romano",
                "Henrique",
                "18/11/2021",
                "Não realizado"
            ),
            Tarefas("Assistir One Piece",
                "Assistir o anime completo",
                "Henrique",
                "19/11/2022",
                "Em andamento"
            ),
            Tarefas("Comprar passagens da viagem",
                "Comprar as passagens da viagem para Paraty",
                "Henrique",
                "20/12/2021",
                "Não realizado"
            ),
            Tarefas("Ir ao Mercado",
                "Precisa comprar muita coisa",
                "Henrique",
                "18/11/2021",
                "Não realizado"
            )
        )

        val recyclerTarefa = findViewById<RecyclerView>(R.id.recyclerTarefa)
        recyclerTarefa.layoutManager = LinearLayoutManager(this)
        recyclerTarefa.adapter = TarefaAdapter(this, tarefas)
        recyclerTarefa.setHasFixedSize(true)

    }
}