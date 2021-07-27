package taxi.service.impl;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverByLogin = driverService.getDriverByLogin(login);
        if (driverByLogin.isEmpty() || !password.equals(driverByLogin.get().getPassword())) {
            throw new AuthenticationException("Login or password is incorrect, please "
                    + "check your data, or click on REGISTER button");
        }
        return driverByLogin.get();
    }
}

