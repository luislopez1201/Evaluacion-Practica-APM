package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.empresa1, R.drawable.empresa_img1, R.integer.anioempresa1),
            Affirmation(R.string.empresa2, R.drawable.empresa_img2, R.integer.anioempresa2),
            Affirmation(R.string.empresa3, R.drawable.empresa_img3, R.integer.anioempresa3),
            Affirmation(R.string.empresa4, R.drawable.empresa_img4, R.integer.anioempresa4),
            Affirmation(R.string.empresa5, R.drawable.empresa_img5, R.integer.anioempresa5),
            Affirmation(R.string.empresa6, R.drawable.empresa_img6, R.integer.anioempresa6),
            Affirmation(R.string.empresa7, R.drawable.empresa_img7, R.integer.anioempresa7),
            Affirmation(R.string.empresa8, R.drawable.empresa_img8, R.integer.anioempresa8),
            Affirmation(R.string.empresa9, R.drawable.empresa_img9, R.integer.anioempresa9),
            Affirmation(R.string.empresa10, R.drawable.empresa_img10, R.integer.anioempresa10))
    }
}
