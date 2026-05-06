fun main() {
    val signalcase_1 = Signal(86, 79, 23, 11, 9)
    check(Policy.score(signalcase_1) == 138)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(68, 98, 10, 20, 4)
    check(Policy.score(signalcase_2) == 94)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(95, 91, 9, 14, 13)
    check(Policy.score(signalcase_3) == 226)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(74, 20, 27, 51)
    check(DomainReviewLens.score(domainReview) == 138)
    check(DomainReviewLens.lane(domainReview) == "watch")
}
