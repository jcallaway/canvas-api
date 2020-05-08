package edu.ksu.canvas.tests.submission;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import edu.ksu.canvas.CanvasTestBase;
import edu.ksu.canvas.impl.SubmissionImpl;
import edu.ksu.canvas.model.assignment.Submission;
import edu.ksu.canvas.net.FakeRestClient;
import edu.ksu.canvas.requestOptions.ListSubmissionOptions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class SubmissionUTest extends CanvasTestBase {

    @Autowired
    private FakeRestClient fakeRestClient;

    private SubmissionImpl service;

    @Before
    public void setUp() {
        service = new SubmissionImpl(baseUrl, apiVersion, SOME_OAUTH_TOKEN, fakeRestClient, SOME_CONNECT_TIMEOUT,
                SOME_READ_TIMEOUT, DEFAULT_PAGINATION_PAGE_SIZE, false);
    }

    @Test
    public void testListCourseSubmissionsForUser() throws IOException {
        String url = baseUrl + "/api/v1/courses/1234/students/submissions?student_ids[]=12345";
        fakeRestClient.addSuccessResponse(url, "SampleJson/submission/submissionResponse.json");
        ListSubmissionOptions options = new ListSubmissionOptions("1234");
        options.userIds(Collections.singletonList("12345"));
        List<Submission> submissions = service.listCourseSubmissionsForUser(options);

        assertEquals(2, submissions.size());
        assertEquals("46399308", submissions.get(0).getId().toString());
        assertEquals("12345", submissions.get(1).getUserId().toString());
    }
}
