package com.sistemasardillisados.ohanaapp;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
public final class Utils {
    //★Animacion
    public static void AnimationBtn(View view) {
        ObjectAnimator shrinkX = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.9f);
        ObjectAnimator shrinkY = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.9f);
        ObjectAnimator expandX = ObjectAnimator.ofFloat(view, "scaleX", 1.05f);
        ObjectAnimator expandY = ObjectAnimator.ofFloat(view, "scaleY", 1.05f);
        ObjectAnimator normalX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
        ObjectAnimator normalY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
        //■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(shrinkX, shrinkY, expandX, expandY, normalX, normalY);
        animatorSet.setDuration(80);
        animatorSet.start();
    }
}