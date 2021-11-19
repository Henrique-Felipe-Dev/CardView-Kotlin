package com.example.cardview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.model.Tarefas

class TarefaAdapter (context: Context,
                     val listTarefas: List<Tarefas>
                     ) : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    class TarefaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textNome = view.findViewById<TextView>(R.id.textNome)
        val textDesc = view.findViewById<TextView>(R.id.textDesc)
        val textDono = view.findViewById<TextView>(R.id.textDono)
        val textData = view.findViewById<TextView>(R.id.textData)
        val textStatus = view.findViewById<TextView>(R.id.textStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val layoutAdapter = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_list, parent, false)

        return TarefaViewHolder(layoutAdapter)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        holder.textNome.text = listTarefas[position].nome
        holder.textDesc.text = listTarefas[position].desc
        holder.textDono.text = listTarefas[position].dono
        holder.textData.text = listTarefas[position].data
        holder.textStatus.text = listTarefas[position].status
    }

    override fun getItemCount(): Int {
        return listTarefas.size
    }

}