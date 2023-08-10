package lol.l1npengtul.mcoutilities.mcoapi

sealed class McOApiError {
    class RateLimited(val tryAgainInSeconds: Int): McOApiError()
    class Failed(val why: String): McOApiError()
}
