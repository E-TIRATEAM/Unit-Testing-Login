<?php
    class Login {
        public function LoginProcess($Sentence) {
            return count(explode(" ",$Sentence));
        }
    }
?>