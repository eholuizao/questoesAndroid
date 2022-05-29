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
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MainFragment : Fragment() {

    private var _binding: FirstFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FirstFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.buttonSecond2.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_MaiorMenorFragment)
        }

        binding.buttonSecond3.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_DescontoFragment)
        }

        binding.buttonSecond4.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_VogalFragment)
        }

        binding.buttonSecond5.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_TabuadaFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}