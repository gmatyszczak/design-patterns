package pl.gmat.designpatterns.factorymethod

class CurrentlyWatchingSocialProofPopup : SocialProofPopup() {
    override fun createSocialProof(): SocialProof = CurrentlyWatchingSocialProof()
}

class CurrentlyWatchingSocialProof : SocialProof