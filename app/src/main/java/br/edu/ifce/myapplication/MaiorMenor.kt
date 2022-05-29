package br.edu.ifce.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.myapplication.databinding.FirstFragmentBinding
import br.edu.ifce.myapplication.databinding.MaiorMenorFragmentBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MaiorMenor : Fragment() {

    private var _binding: MaiorMenorFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MaiorMenorFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            //Entrada
            var valor1 = binding.valor1.text.toString().toIntOrNull()?:0
            var valor2 = binding.valor2.text.toString().toIntOrNull()?:0
            var valor3 = binding.valor2.text.toString().toIntOrNull()?:0

            // Processamento
            var valores = arrayListOf<Int>(valor1, valor2, valor3)
            valores.sort()

            //Saída
            binding.resultado.setText("Maior: ${valores[0]} \nMenor: ${valores[2]}")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}