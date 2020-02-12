package algo.math.matrix

class Matrix<T> constructor(data: Array<Array<T>>) {

    companion object {

        inline operator fun <reified T> invoke() = Matrix(0, 0, Array(0) { emptyArray<T>() })

        inline operator fun <reified T> invoke(rowsCount: Int, columnsCount: Int) =
            Matrix(Array(columnsCount) { arrayOfNulls<T>(rowsCount) })

        inline operator fun <reified T> invoke(rowsCount: Int, columnsCount: Int, initialValue: T): Matrix<T> =
            Matrix(Array(rowsCount) { Array(columnsCount) { initialValue }})
    }

    private val _data = data

    operator fun get(x: Int, y: Int): T {
        return _data[x][y]
    }

    operator fun set(x: Int, y: Int, t: T) {
        _data[x][y] = t
    }

    val rowsCount: Int get() = _data.size
    val columnsCount: Int get() = if (rowsCount > 0) _data[0].size else 0

    override fun toString(): String {
        return _data.joinToString(prefix = "(", postfix = ")", separator = "\n") {
            it.joinToString { it.toString() }
        }
    }


}



fun main(args: Array<String>) {

    val m = Matrix(2,2, 0)
    println(m)

    val d = Matrix(arrayOf(arrayOf(1, 2, 3)))

    println(d.rowsCount)
    println(d.columnsCount)
    println(d[0, 1])
}
