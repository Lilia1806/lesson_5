package lesson_5_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.lesson_5.R

class FirstFragment : Fragment() {
    var pas_first: EditText? = null
    var bt_first: Button? = null
    var lilia = "lilia"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pas_first = view.findViewById(R.id.pas_first)
        bt_first = view.findViewById(R.id.bt_first)
        click()
    }

    private fun click() {
        bt_first!!.setOnClickListener {
            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    val password = pas_first!!.text.toString().trim { it <= ' ' }
                    if (password != lilia) {
                        pas_first!!.error = "Не правельный пароль!"
                    } else {
                        parentFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view, SecondFragment())
                            .commit()
                    }
                }
            }
        }
    }
}