package seedu.medmoriser.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.medmoriser.model.Model.PREDICATE_SHOW_ALL_QUESTIONSETS;

import seedu.medmoriser.model.Model;

/**
 * Lists all questionSets in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all questionSets";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredQuestionSetList(PREDICATE_SHOW_ALL_QUESTIONSETS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}