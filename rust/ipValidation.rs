use regex::Regex;

fn main() {
    use std::io::{self, Write};

    print!("{}", is_valid_ip("2014-01-01"));
}

fn is_valid_ip(ip: &str) -> bool {
    let regex = Regex::new(r"^\d{4}-\d{2}-\d{2}$").unwrap();
    return assert!(regex.is_match(ip))
}