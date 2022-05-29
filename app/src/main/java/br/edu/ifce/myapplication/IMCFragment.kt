package br.edu.ifce.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.myapplication.databinding.FirstFragmentBinding
import br.edu.ifce.myapplication.databinding.SecondFragmentBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class IMCFragment : Fragment() {

    private var _binding: SecondFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            //Entrada
            var altura = binding.inputAltura.text.toString().toFloat()
            var peso = binding.inputPeso.text.toString().toFloat()

            // Processamento
            var imc = peso/ (altura * altura)
            var situacao = ""

            if (imc < 18.5)
                situacao = "Muito abaixo do peso"
            else if (imc < 20)
                situacao = "Abaixo do peso"
            else if (imc < 25)
                situacao = "Peso normal"
            else if (imc < 30)
                situacao = "acima do peso"
            else if (imc < 35)
                situacao = "Obesidade I"
            else if (imc < 40)
                situacao = "Obesidade II"
            else
                situacao = "Ta gordin hein pae"

            //Saída
            //{dec.format(imc).toString()
            binding.resultado.setText("Imc: ${String.format("%.2f", imc)} \nSituação:${situacao}")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}