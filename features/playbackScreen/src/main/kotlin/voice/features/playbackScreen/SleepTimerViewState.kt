package voice.features.playbackScreen

data class SleepTimerViewState(
  val customSleepTime: Int,
  val chapters: List<Chapter> = emptyList(),
) {

  data class Chapter(
    val index: Int,
    val name: String,
    val listeningTime: String,
  ) {
    val number: Int get() = index + 1
  }
}
