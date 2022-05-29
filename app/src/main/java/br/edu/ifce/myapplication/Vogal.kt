package br.edu.ifce.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.myapplication.databinding.FirstFragmentBinding
import br.edu.ifce.myapplication.databinding.VogalFragmentBinding
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Vogal : Fragment() {

    private var _binding: VogalFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = VogalFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            //Entrada
            var letra = binding.letraTxt.text.toString().lowercase()

            //Processamentos
            val vogais = arrayOf("a", "e", "i", "o", "u")
            when(letra.first().toString()) {
                in vogais -> binding.resultado.setText("É uma vogal!")
                else -> binding.resultado.setText("Não é uma vogal!")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

