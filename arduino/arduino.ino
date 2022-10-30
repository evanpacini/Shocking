const int RELAY = 2;

void setup() {
  pinMode(RELAY, OUTPUT);       // Enable for OUTPUT
  digitalWrite(RELAY, HIGH);    // Relay is open on HIGH
  Serial.begin(9600);           // Wait for serial messages
}

void loop() {
  if (Serial.available() > 0) { // If a byte was sent
    Serial.read();              // Get rid of byte
    digitalWrite(RELAY, LOW);   // Close the relay
    delay(50);                  // Wait for 50 ms before opening
    digitalWrite(RELAY, HIGH);  // Open the relay
    delay(50);                  // Wait for 50 ms before processing any other bytes
  }
}
