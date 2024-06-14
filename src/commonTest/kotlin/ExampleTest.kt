import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SimpleTest : StringSpec({
    "1 + 1 should be 2" {
        (1 + 1) shouldBe 2
    }

    "length of 'Kotest' should be 6" {
        "Kotest".length shouldBe 6
    }
})