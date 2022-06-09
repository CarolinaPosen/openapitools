package eu.senla.aircraft.api;
import gen.senla.api.ApiApi;
import gen.senla.model.Aircraft;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"${openapi..base-path:}"})
public class AircraftController implements ApiApi {
    @Override
    public ResponseEntity<List<Aircraft>> getAircrafts() {
        List<Aircraft> aircrafts = new ArrayList<>();
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1L);
        aircraft.setModel("Airbus");
        aircraft.setRange(2000);
        aircrafts.add(aircraft);
        return ResponseEntity.ok(aircrafts);
    }
}
