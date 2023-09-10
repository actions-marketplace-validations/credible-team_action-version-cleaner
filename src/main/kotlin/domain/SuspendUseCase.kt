package domain

internal interface SuspendUseCase<INPUT, OUTPUT> {
    suspend operator fun invoke(input: INPUT): Result<OUTPUT>
}