package br.edu.ifce.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.myapplication.databinding.FirstFragmentBinding
import br.edu.ifce.myapplication.databinding.DescontoFragmentBinding
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Desconto : Fragment() {

    private var _binding: DescontoFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = DescontoFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            //Entrada
            var price = binding.priceTxt.text.toString().toDouble()

            // Processamento
            var desconto = (9 * price) / 100

            //Saída
            binding.resultado.setText("R$$price com desconto de 9% é: ${String.format("%.2f", price - desconto)}")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

