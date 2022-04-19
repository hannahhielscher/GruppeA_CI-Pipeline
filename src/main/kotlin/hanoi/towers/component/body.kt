package hanoi.towers.component

import androidx.compose.runtime.Composable
import hanoi.towers.data.*
import lib.compose.Markup
import lib.lens.Storage
import lib.lens.times
import hanoi.towers.maxNumberOfSlices
import lib.language.*
import org.jetbrains.compose.web.dom.*

@Markup
@Composable
@Suppress("FunctionName")
fun Body(storage: Storage<AppData>) {

    val texts = (storage * languageLens).read() as Block
    val mainPageTexts = texts.component("hanoi.mainPage")

    Container{
        NavBar(
            storage * localesLens,
            storage * localeLens,
            texts.component("hanoi.locales")
        )
        H1 { Text( mainPageTexts["headline"]) }

        Form(
            storage * numberOfSlicesLens,
            storage * numberOfMovesLens,
            storage * hanoiLens,
            storage * movesLens,
            storage * isComputingMovesLens,
            storage * indexOfCurrentMoveLens,
            storage * errorLens,
            texts, //mainPageTexts.component("form"), // TODO(Conceptual mistake: see OnError )
            maxNumberOfSlices
        )
        OnError(storage * errorLens) // TODO(Conceptual mistake: Must be part of the form component)

        Statistics(
            storage * numberOfSlicesLens,
            storage * numberOfMovesLens,
            "statistics" of mainPageTexts
        )

        Flex {
            ListOfMoves(
                storage * movesLens,
                storage * isComputingMovesLens,
                "listOfMoves" of mainPageTexts
            )
            HanoiVisualization(
                storage * movesLens,
                storage * hanoiLens,
                storage * numberOfMovesLens,
                storage * indexOfCurrentMoveLens,
                storage * movesPerSecondLens,
                storage * isPlayingLens,
                "visualization" of mainPageTexts
            )
        }
    }
}