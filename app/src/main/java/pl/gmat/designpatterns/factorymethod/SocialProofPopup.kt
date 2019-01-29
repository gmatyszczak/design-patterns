package pl.gmat.designpatterns.factorymethod

abstract class SocialProofPopup {

    abstract fun createSocialProof(): SocialProof

    fun show() {
        val socialProof = createSocialProof()
        doSomeStuff(socialProof)
    }

    //implementation details
    private fun doSomeStuff(socialProof: SocialProof) = Unit
}

interface SocialProof