package seedu.medmoriser.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.medmoriser.model.Medmoriser;
import seedu.medmoriser.model.ReadOnlyMedmoriser;
import seedu.medmoriser.model.qanda.Answer;
import seedu.medmoriser.model.qanda.Email;
import seedu.medmoriser.model.qanda.Phone;
import seedu.medmoriser.model.qanda.QAndA;
import seedu.medmoriser.model.qanda.Question;
import seedu.medmoriser.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static QAndA[] getSampleQuestionSets() {
        return new QAndA[] {
            new QAndA(new Question("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Answer("Blk 30 Geylang Street 29, #06-40"),
                getTagSet("friends")),
            new QAndA(new Question("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Answer("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                getTagSet("colleagues", "friends")),
            new QAndA(new Question("Charlotte Oliveiro"), new Phone("93210283"),
                new Email("charlotte@example.com"), new Answer("Blk 11 Ang Mo Kio Street 74, #11-04"),
                getTagSet("neighbours")),
            new QAndA(new Question("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Answer("Blk 436 Serangoon Gardens Street 26, #16-43"),
                getTagSet("family")),
            new QAndA(new Question("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Answer("Blk 47 Tampines Street 20, #17-35"),
                getTagSet("classmates")),
            new QAndA(new Question("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Answer("Blk 45 Aljunied Street 85, #11-31"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyMedmoriser getSampleMedmoriser() {
        Medmoriser sampleAb = new Medmoriser();
        for (QAndA sampleQAndA : getSampleQuestionSets()) {
            sampleAb.addQuestionSet(sampleQAndA);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
