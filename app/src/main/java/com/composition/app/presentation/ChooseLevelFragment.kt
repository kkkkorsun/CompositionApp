package com.composition.app.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.composition.app.R
import com.composition.app.databinding.FragmentChooseLevelBinding
import com.composition.app.domain.entity.Level


class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            buttonLevelTest.setOnClickListener {
                launchFragment(Level.TEST)
            }
            buttonLevelEasy.setOnClickListener {
                launchFragment(Level.EASY)
            }
            buttonLevelMedium.setOnClickListener {
                launchFragment(Level.MEDIUM)
            }
            buttonLevelHard.setOnClickListener {
                launchFragment(Level.HARD)
            }
        }
    }

    private fun launchFragment(level: Level) {
        requireActivity().supportFragmentManager.beginTransaction()
            .addToBackStack(GameFragment.NAME)
            .replace(R.id.main_container, GameFragment.newInstance(level))
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }
}