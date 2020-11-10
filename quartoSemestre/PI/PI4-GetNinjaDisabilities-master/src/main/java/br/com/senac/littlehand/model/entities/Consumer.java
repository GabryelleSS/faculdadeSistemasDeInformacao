package br.com.senac.littlehand.model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Consumer implements Serializable, UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastName;
	private String cpf;
	private String email;
	private String password;
	private String avatar;
	private String birthDate;
	private String number1;
	private String number2;

	@OneToOne
	private Address address;

	@OneToMany
	private List<Tags> tags = new ArrayList<Tags>();

	@OneToMany(fetch = FetchType.LAZY)
	private List<Cid> cids = new ArrayList<Cid>();
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Preference> preferences = new HashSet<Preference>();

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
