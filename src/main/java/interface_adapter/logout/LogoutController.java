package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private final LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        // Save the interactor in the instance variable.
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging in
     */
    public void execute(String username) {
        // run the use case interactor for the logout use case
        // 1. Instantiate the `LogoutInputData`, which should contain the username
        LogoutInputData inputData = new LogoutInputData(username);

        // 2. Tell the interactor to execute the logout use case
        logoutUseCaseInteractor.execute(inputData);
    }
}
