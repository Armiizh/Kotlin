import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.net.URL

fun main(args: Array<String>) {

    val url = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4"

    Streams(BufferedInputStream(URL(url).openStream()), File("someVideo.mp4").outputStream()) {
        inputStream, outputStream -> inputStream.copyTo(outputStream)
    }.start()
}

fun File.copyInputStreamToFile(inputStream: InputStream) {
    this.outputStream().use { fileOut -> inputStream.copyTo(fileOut) }
}

public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = DEFAULT_BUFFER_SIZE): Long {
    var bytesCopied: Long = 0
    val buffer = ByteArray(bufferSize)
    var bytes = read(buffer)
    while (bytes >= 0) {
        out.write(buffer, 0, bytes)
        bytesCopied += bytes
        bytes = read(buffer)
    }
    return bytesCopied
}

class Streams(
    private val inStream: InputStream,
    private val outStream: OutputStream,
    private val streamHandler: (InputStream, OutputStream) -> Unit) {

    fun start() = inStream.use {
        outStream.use {
            streamHandler.invoke(inStream, outStream)
        }
    }
}
