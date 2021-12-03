<?php
    // Path to run ./vendor/bin/phpunit --bootstrap vendor/autoload.php test.php
    // Include framework PHPUnit
    use PHPUnit\Framework\TestCase;

    // Memanggil class yang ingin dilakukan testing
    require 'Login.php';

    // Class untuk running testing login
    class TestCode extends TestCase {
        public function testLogin() {
            // Memanggil class yang ingin ditest.
            $Pl = new Login();

            // Memberi kalimat dalam parameter sebanyak 2 kata, yang harusnya mendapatkan 2 output
            $TestSentence = "Berhasil Login"; // 2 Kata ..
            $Login = $Pl -> LoginProcess($TestSentence);
            
            // Output ketika berhasil login
            $this -> assertEquals(2, $Login); 
        }
    }
?>