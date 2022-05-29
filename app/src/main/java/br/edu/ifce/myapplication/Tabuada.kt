package br.edu.ifce.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.myapplication.databinding.FirstFragmentBinding
import br.edu.ifce.myapplication.databinding.TabuadaBinding
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Tabuada : Fragment() {

    private var _binding: TabuadaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = TabuadaBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            //Entrada
            var num = binding.numeroTxt.text.toString().toFloat()

            //Processamentos
            fun createTabString(num: Float): String {
                var str = ""

                for(x in 1..10)
                    str += "$num * $x = ${num * x}\n"

                return str
            }
            binding.resultado.setText(createTabString(num))

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

