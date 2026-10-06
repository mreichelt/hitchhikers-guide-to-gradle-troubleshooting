import kotlin.time.Duration.Companion.seconds

tasks.register("getAnswer") {
    group = "compute"
    description =
        "Computes the answer to the Ultimate Question of Life, the Universe, and Everything"

    val outputFile = layout.buildDirectory.file("answer.txt")

    outputs.file(outputFile)
    outputs.upToDateWhen { true }
    outputs.cacheIf { true }

    doLast {
        logger.info("Computing the answer... come back in 7.5 million years.")
        Thread.sleep(9.seconds.inWholeMilliseconds) // not 7.5 million years, but who's counting? 😄
        outputFile.get().asFile.writeText("42")
    }
}
