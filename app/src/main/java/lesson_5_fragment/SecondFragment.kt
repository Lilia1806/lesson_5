package lesson_5_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_5.MoviesAdapter
import com.example.lesson_5.R

class SecondFragment : Fragment() {
    private val list: MutableList<String> = ArrayList()
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rv_movies)
        list.add("Мстители")
        list.add("Илюзия обмана")
        list.add("Стражи галактики")
        list.add("Дэдпул")
        list.add("Алиса в стране чудес")
        list.add("Дьявол носит Prada")
        list.add("Бегуший в лаберинте")
        list.add("Круэлла")
        list.add("Первому игроку подготовиться")
        list.add("Легенда")
        list.add("Новый Человек-паук")
        list.add("Голодные игры")
        list.add("Аватар")
        val moviesAdapter = MoviesAdapter(listMovies = list)
        recyclerView?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        recyclerView?.adapter = moviesAdapter
    }
}