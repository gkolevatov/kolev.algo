package algo.math.matrix


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MatrixTest {
    @Test
    fun `empty matrix creation`() {
        val m: Matrix<Int?> = Matrix(0, 0)

        assertEquals(0, m.columnsCount)
        assertEquals(0, m.rowsCount)
    }
}