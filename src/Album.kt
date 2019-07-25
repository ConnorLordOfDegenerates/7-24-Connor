fun main(){

    class Album(val title: String, val artist: String){
        fun play(){
            println("Now Playing: $title by $artist")
        }
        fun stop(){
            println("$title has stopped playing")
        }
    }
    var songs = arrayOf (Album("Nuts", "Deez"), Album("Yo Mama", "Obama"), Album("Breezy", "Yeezy"))

    songs[1].play()
    songs[1].stop()
    songs[2].play()
}