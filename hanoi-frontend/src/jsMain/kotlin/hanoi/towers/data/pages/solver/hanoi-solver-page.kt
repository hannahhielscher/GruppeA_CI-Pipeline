package hanoi.towers.data.pages.solver

import hanoi.towers.data.hanoi.Moves
import hanoi.towers.data.pages.solver.component.HanoiSolver
import lib.language.Lang
import lib.optics.Lensify
import lib.optics.ReadOnly
import lib.optics.ReadWrite
import lib.optics.lens.Lens

@Lensify data class HanoiSolverPage(
    @ReadOnly val texts: Lang.Block,
    @ReadWrite val solver: HanoiSolver,
    @ReadWrite val numberOfSlices: Int,
    @ReadWrite val moves: Moves,
    @ReadWrite val indexOfCurrentMove: Int,
    @ReadWrite val numberOfMoves: Int,
    @ReadWrite val isComputingMoves: Boolean,
    @ReadWrite val isPlaying: Boolean,
    @ReadWrite val movesPerSecond: Int,
    @ReadWrite val error: String?
)

/**
 * Autogenerated ReadOnly Lens.
 * Read [HanoiSolverPage.texts]
 */
@ReadOnly val texts: Lens<HanoiSolverPage, Lang.Block> by lazy {
    Lens(
        get = { whole -> whole.texts },
        set = { { it } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.solver]
 */
@ReadWrite val solver: Lens<HanoiSolverPage, HanoiSolver> by lazy {
    Lens(
        get = { whole -> whole.solver },
        set = { part -> { whole -> whole.copy(solver = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.numberOfSlices]
 */
@ReadWrite val numberOfSlices: Lens<HanoiSolverPage, Int> by lazy {
    Lens(
        get = { whole -> whole.numberOfSlices },
        set = { part -> { whole -> whole.copy(numberOfSlices = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.moves]
 */
@ReadWrite val moves: Lens<HanoiSolverPage, Moves> by lazy {
    Lens(
        get = { whole -> whole.moves },
        set = { part -> { whole -> whole.copy(moves = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.indexOfCurrentMove]
 */
@ReadWrite val indexOfCurrentMove: Lens<HanoiSolverPage, Int> by lazy {
    Lens(
        get = { whole -> whole.indexOfCurrentMove },
        set = { part -> { whole -> whole.copy(indexOfCurrentMove = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.numberOfMoves]
 */
@ReadWrite val numberOfMoves: Lens<HanoiSolverPage, Int> by lazy {
    Lens(
        get = { whole -> whole.numberOfMoves },
        set = { part -> { whole -> whole.copy(numberOfMoves = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.isComputingMoves]
 */
@ReadWrite val isComputingMoves: Lens<HanoiSolverPage, Boolean> by lazy {
    Lens(
        get = { whole -> whole.isComputingMoves },
        set = { part -> { whole -> whole.copy(isComputingMoves = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.isPlaying]
 */
@ReadWrite val isPlaying: Lens<HanoiSolverPage, Boolean> by lazy {
    Lens(
        get = { whole -> whole.isPlaying },
        set = { part -> { whole -> whole.copy(isPlaying = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.movesPerSecond]
 */
@ReadWrite val movesPerSecond: Lens<HanoiSolverPage, Int> by lazy {
    Lens(
        get = { whole -> whole.movesPerSecond },
        set = { part -> { whole -> whole.copy(movesPerSecond = part) } }
    )
}

/**
 * Autogenerated Lens.
 * Read and manipulate [HanoiSolverPage.error]
 */
@ReadWrite val error: Lens<HanoiSolverPage, String?> by lazy {
    Lens(
        get = { whole -> whole.error },
        set = { part -> { whole -> whole.copy(error = part) } }
    )
}
