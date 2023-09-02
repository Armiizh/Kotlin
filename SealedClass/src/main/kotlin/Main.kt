fun main(args: Array<String>) {
    val repository = object : Repository {
        override fun getData(): Result {
            TODO()
        }
    }
    when (val result = repository.getData()) {
        is Result.Success -> print(result.data)
        is Result.Error -> throw IllegalArgumentException(result.message)
    }
}