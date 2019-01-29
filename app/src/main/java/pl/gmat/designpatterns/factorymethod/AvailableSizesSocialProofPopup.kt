package pl.gmat.designpatterns.factorymethod

class AvailableSizesSocialProofPopup : SocialProofPopup() {
    override fun createSocialProof(): SocialProof = AvailableSizesSocialProof()
}

class AvailableSizesSocialProof : SocialProof