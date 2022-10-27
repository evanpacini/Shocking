const int IN1 = 2;
const int IN2 = 3;
const int IN3 = 4;
const int IN4 = 5;

void setup() {
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);
  digitalWrite(IN1, HIGH);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, HIGH);

  Serial.begin(9600);
}

void loop() {
  if (Serial.available() > 0) {
    Serial.read();
    Serial.println("1");
    digitalWrite(IN1, LOW);
    delay(50);
    digitalWrite(IN1, HIGH);
    delay(50);
  }
}
