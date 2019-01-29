package pl.gmat.designpatterns.factorymethod

class BuyersThisWeekSocialProofPopup : SocialProofPopup() {
    override fun createSocialProof(): SocialProof = BuyersThisWeekSocialProof()
}

class BuyersThisWeekSocialProof : SocialProof